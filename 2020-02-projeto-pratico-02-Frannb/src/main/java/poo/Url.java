package poo;

public enum Url {
    DESKTOP("img/desktop.png"),
    CAMERA("img/ip-camera.png"),
    SERVIDOR("img/rack-server.png"),
    ROTEADOR( "img/blue-router.png"),
    FIREWALL("img/firewall.png"),
    SWITCH("img/switch.png"),
    INTERNET("img/cloud.png");

    protected String url;

    Url(String url) {
        this.url = url;
    }

}
