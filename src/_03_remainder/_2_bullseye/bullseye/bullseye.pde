
void setup() {
 
  // set the size of your sketch
  size(600, 600);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 500; i > 0; i-=51){
    if(i % 2 == 0){
      fill(255, 0, 0);
    }
    else { 
       fill(0, 0, 0);
    }
  ellipse(300, 300,  i, i);
    
  }
 //Use an if statement and remainder to alternate the color of your rings.
  
  
}
