import { Component } from '@angular/core';

@Component({
	selector: 'app-power-boost-calculator',
	template: `
	<h2>Power Boot Calc</h2>
	<div>Normal power: <input [(ngModel)]="power"></div>
	<div>Boot factor: <input [(ngModel)]="factor"></div>
	<p>
		Super Hero Boost: {{power | exponentialStrength: factor}}
	</p>
	`
})

export class PowerBoostClculatorComponent {
	power = 5;
	factor = 1;
}