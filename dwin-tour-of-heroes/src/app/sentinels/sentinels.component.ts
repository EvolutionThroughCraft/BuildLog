import { Component, OnInit } from '@angular/core';
import { Hero } from '../hero';
import { HEROES } from '../mock-heroes';

@Component({
  selector: 'app-sentinels',
  templateUrl: './sentinels.component.html',
  styleUrls: ['./sentinels.component.css']
})
export class SentinelsComponent implements OnInit {


  // heroes: Hero[];
  selectedHero: Hero;


  onSelect(hero: Hero): void {
    this.selectedHero = hero;
  }


  // hero: Hero = { 
  // 	id: 1,
  // 	name: 'Legacy'
  // };

  heroes = HEROES;

  constructor() { }

  ngOnInit() {

  }

}

