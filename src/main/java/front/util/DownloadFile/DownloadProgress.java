package front.util.DownloadFile;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import static front.util.DownloadFile.DownloadFileStart.DFP;
import static front.util.DownloadFile.DownloadFileStart.DURL;

public class DownloadProgress extends Thread {
    public void run() {
        long FileSize = 0;
        long StartTime = System.currentTimeMillis();

        try {
            URL url = new URL(DURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                FileSize = connection.getContentLengthLong();
            } else {
                DownloadProgressUI.下载文件Sa.setText("下载文件\n\nURL: " + DURL + "\n状态: 下载...\n获取文件信息失败(" + responseCode + ")");
                sleep(3000);
                DownloadProgressUI.frame.dispose();
            }
            connection.disconnect();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        double Progress = 0;
        for (int i = 0; i < 1; ) {
            int ProgressO = 0;
            try {
                ProgressO = (int) Files.size(Path.of(DFP));
            } catch (IOException e) {
                e.getMessage();
            }

            Progress = (double) ProgressO / FileSize * 100;
            DownloadProgressUI.下载进度Sa.setValue((int) Progress);

            long EndTime = System.currentTimeMillis();
            long ElapsedTime = EndTime - StartTime;
            int time = (int) (ElapsedTime / 1000);

            DownloadProgressUI.下载文件Sa.setText("下载文件\n\nURL: " + DURL + "\n进度: " + Progress + "%\n时间: " + time + "s\n状态: 下载...");

            if (DownloadProgressUI.下载进度Sa.getValue() == 100) {
                DownloadProgressUI.frame.dispose();
            }
        }
    }
}
