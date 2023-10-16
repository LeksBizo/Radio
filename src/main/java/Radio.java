public class Radio {

    private int currentStation;
    private int currentVolume; // alt + insert (Getter and Setter)

        public void next(){   //для Станций вперед
        if (currentStation != 9) {
            currentStation++;
            return;
        }
            currentStation = 0; //переключался с 9 на 0.
        }

        public void next2(){  //для Громкости вперед
        if (currentVolume != 100) {
            currentVolume++;
            return;
        }
        currentVolume = 0; //переключался с 9 на 0.
    }

    public void prev(){ // - для станций
        if (currentStation != 0){
            currentStation --;
            return;
        }
        currentStation = 9;
    }

    public void prev2(){ // - для громкости
        if (currentVolume != 0){
            currentVolume --;
            return;
        }
        currentStation = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0){
            return;
        }
        if (currentStation > 9){
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100){
            return;
        }
        if (currentVolume < 0){
            return;
        }
        this.currentVolume = currentVolume;
    }

}
