package front.util.DownloadFile;

import javax.swing.*;

public class DownloadProgressUI {
    public static JFrame frame;
    private JPanel jp;
    private JProgressBar 下载进度;
    public static JProgressBar 下载进度Sa;
    private JTextArea 下载文件;
    public static JTextArea 下载文件Sa;
    private JLabel 内容;

    public DownloadProgressUI() {
        下载进度Sa = 下载进度;
        下载文件Sa = 下载文件;
    }

    public static void main() {
        JFrame frame = new JFrame("下载文件");
        frame.setContentPane(new DownloadProgressUI().jp);
        frame.setSize(700, 400);
        frame.setVisible(true);
        DownloadProgressUI.frame = frame;
    }
}
