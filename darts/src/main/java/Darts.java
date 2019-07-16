class Darts {

    double x,y;
    int score=0;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double dist = Math.sqrt( (x*x) + (y*y) );
        
        if(dist<=1){
            score = 10;
        } else if(dist<=5){
            score = 5; 
        } else if(dist<=10){
            score = 1;
        }
        return score;
    }
}
