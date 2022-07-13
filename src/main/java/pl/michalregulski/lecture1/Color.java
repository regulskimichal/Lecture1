package pl.michalregulski.lecture1;

public enum Color {

    RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);

    private int hexCode;

    Color(int hexCode) {
        this.hexCode = hexCode;
    }

    public int getHexCode() {
        return hexCode;
    }

}
