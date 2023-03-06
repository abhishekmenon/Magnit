import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormComponent } from './pages/form/form.component';
import { PersonComponent } from './pages/person/person.component';

const routes: Routes = [
  {
    path: 'person',
    component:PersonComponent,
    pathMatch:'full',
  },
  {
    path: 'form',
    component:FormComponent,
    pathMatch:'full',
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
