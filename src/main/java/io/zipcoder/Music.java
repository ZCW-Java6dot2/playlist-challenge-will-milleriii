package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer forwardButton = 0;
        Integer backwardsButton = 0;
        int i = startIndex.intValue();
        int j = startIndex.intValue();
        int firstSong = 0;
        int lastSong = playList.length - 1;
        while (playList[i] != selection && playList[j] != selection) {
            forwardButton++;
            backwardsButton++;
            if (i == lastSong){
                i = firstSong;
            } if (j == firstSong) {
                j = lastSong;
            } i++;
        } j--;
        return forwardButton < backwardsButton ? forwardButton : backwardsButton;
    }
}
