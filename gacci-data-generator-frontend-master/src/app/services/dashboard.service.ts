import {Injectable} from "@angular/core";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable, of} from "rxjs";
import {NovosPacientes} from "../model/novosPacientes";


@Injectable({
  providedIn: 'root'
})
export class DashboardService {
  private apiUrl = 'http://localhost:8080/dashboard';

  constructor(private http: HttpClient) {
  }

  getNovosPacientes(): Observable<NovosPacientes[]> {
    const token = localStorage.getItem('token');
    const headers = new HttpHeaders({
      'Authorization': `Bearer ${token}`
    });

    return this.http.get<NovosPacientes[]>(this.apiUrl.concat('/novosPacientes') , {
      headers: headers,
      withCredentials: true
    });
  }

  getEstadocivil(): Observable<any> {
    const token = localStorage.getItem('token');
    const headers = new HttpHeaders({
      'Authorization': `Bearer ${token}`
    });

    return this.http.get<any>(this.apiUrl.concat('/estadocivil') , {
      headers: headers,
      withCredentials: true
    });
  }

  getFaixaEtaria(): Observable<any> {
    const token = localStorage.getItem('token');
    const headers = new HttpHeaders({
      'Authorization': `Bearer ${token}`
    });

    return this.http.get<any>(this.apiUrl.concat('/faixaEtaria') , {
      headers: headers,
      withCredentials: true
    });
  }




  private getHeaders(): HttpHeaders {
    let token = '';
    if (typeof window !== 'undefined' && localStorage.getItem('token')) {
      token = localStorage.getItem('token') || '';
    }
    return new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${token}`
    });
  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(`${operation} failed: ${error.message}`);
      return of(result as T);
    };
  }

}
