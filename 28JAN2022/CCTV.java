public class CCTV {
    CaptureVideo captureVideo;
    int pos;

    public CCTV() {
        this.captureVideo = new CaptureVideo();
    }

    public void startCapture() {
        captureVideo.startCapturing();
    }

    public void turnOffCapturing() {
        captureVideo.t.interrupt();
    }
    public void moveLeft() {
        this.pos-=5;
    }

    public void moveRight() {
        this.pos+=5;
    }

}

class CaptureVideo implements Runnable {
    Thread t;
    public CaptureVideo() {
        t = new Thread(this, "Video");
    }

    public void startCapturing() {
        t.start();
    }


    public void run() {
        while(!Thread.currentThread().isInterrupted()) {

            System.out.println("Capturing Video.....");
        }
    }
}