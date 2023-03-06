import { Component, ElementRef, ViewChild } from '@angular/core';
import { UserServiceService } from 'src/app/services/user-service.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {
  typesOfChoice = [{name:'Not at ALL',value:0}, {name:'Maybe',value:1}, {name:'Strongly Agree',value:2}];
  public starRating = 0; 
  post: any[]=[];
  posts: ArrayBuffer | undefined;
  constructor(private userService:UserServiceService){}

  public person={
    quest1:null,
    quest2:null,
    quest3:null,
    quest4:null,
    quest5:null,
    quest6:null,
  }
  ariaRequired: boolean=true;
  formsubmit(){
    console.log(this.person);
    if(this.person.quest1==null||this.person.quest1==null||this.person.quest2==null||this.person.quest3==null||this.person.quest4==null||this.person.quest5==null||this.person.quest6==null)
    {
      alert("please fill all the details!!")
    }
    else{
      this.userService.addUser(this.person).subscribe(
        (data)=>{
            console.log(data);
            alert('success');
            alert("Your happiness score in percentage is:"+data+"%");
            this.userService.get('posts').subscribe((response) => {
              this.posts = response;
              console.log(this.posts);
            });
        },
        (error)=>{
            console.log(error);
            alert('something went wrong');   
          }
      );
      
    }

    
  }

}
