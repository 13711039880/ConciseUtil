package front.util.DownloadFile;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadFileStart extends Thread {
    public static String DURL;
    public static String DFP;

    public void run() {
        DownloadProgress DownloadProgress = new DownloadProgress();
        DownloadProgress.start();
        DownloadProgressUI.main();
        DownloadProgressUI.下载文件Sa.append("下载文件\n\n\nURL: " + DURL + "\n\n\n状态: 等待...");

        try {
            DownloadFile(DURL, DFP);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void DownloadFile(String fileUrl, String savePath) throws IOException {
        DownloadProgressUI.下载文件Sa.setText("下载文件\n\nURL: " + DURL + "\n状态: 准备...");

        URL url = new URL(fileUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedInputStream inputStream = new BufferedInputStream(connection.getInputStream());
                 FileOutputStream outputStream = new FileOutputStream(savePath)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
        } else {
            DownloadProgressUI.下载文件Sa.setText("下载文件\n\nURL: " + DURL + "\n状态: 下载...\n下载文件失败, 响应码: " + responseCode);
        }

        connection.disconnect();

        DownloadProgress DownloadProgressT = new DownloadProgress();
        DownloadProgressT.interrupt();
    }
}
