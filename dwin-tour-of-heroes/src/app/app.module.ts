import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { SentinelsComponent } from './sentinels/sentinels.component';
import { FormsModule } from '@angular/forms';
import { SentinalDetailComponent } from './sentinal-detail/sentinal-detail.component';
// import { PowerBoostClculatorComponent } from './power-boot-calculator.component';


@NgModule({
  declarations: [
    AppComponent,
    SentinelsComponent,
    SentinalDetailComponent,
    // PowerBoostClculatorComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
