import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http:HttpClient) { }

  public addUser(person:any){
    return this.http.post(`${baseUrl}/person1`,person);
  }
  public get(person:any){
    return this.http.get(`${baseUrl}/person1`,person);
  }
}
