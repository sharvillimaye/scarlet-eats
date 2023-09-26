import {Component, Input, EventEmitter, Output, OnInit, OnChanges, DoCheck, SimpleChanges} from '@angular/core';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit, OnChanges, DoCheck {
  @Input('img') postImage = ''
  @Output() imgSelected = new EventEmitter<string>()

  constructor() {
    console.log('constructor() called', this.postImage)
  }

  ngOnInit() {
    console.log('ngOnInit() called', this.postImage)
  }

  ngDoCheck(): void {
    console.log('ngDoCheck() called')
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('ngOnChanges() called')
  }
}
