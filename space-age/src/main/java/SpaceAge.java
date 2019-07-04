class SpaceAge {

    double seconds;
    double ageOnEarth;

    SpaceAge(double seconds) {
        this.seconds = seconds;
        onEarth();
    }

    double onEarth() {
        ageOnEarth = seconds/31557600;
        return ageOnEarth;
    }

    double onMercury() {
        return ageOnEarth/0.2408467;
    }

    double onVenus() {
        return ageOnEarth/0.61519726;
    }

    double onMars() {
        return ageOnEarth/1.8808158;   
    }

    double onJupiter() {
        return ageOnEarth/11.862615;
    }

    double onSaturn() {
        return ageOnEarth/29.447498;
    }

    double onUranus() {
        return ageOnEarth/84.016846;
    }

    double onNeptune() {
        return ageOnEarth/164.79132;
    }

}
