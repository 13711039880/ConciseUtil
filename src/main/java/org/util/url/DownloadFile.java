package org.util.url;

import front.util.DownloadFile.DownloadFileStart;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * 下载文件
 * @author 8043
 * @see front.util.DownloadFile.DownloadFileStart
 * @see front.util.DownloadFile.DownloadProgress
 * @see front.util.DownloadFile.DownloadProgressUI
 */

public class DownloadFile {
    /**
     * 下载文件(有UI)
     * @param URL 文件URL
     * @param DFP 下载下来的文件
     */
    public static void UiToFile(@NotNull String URL, @NotNull String DFP) {
        DownloadFileStart.DURL = URL;
        DownloadFileStart.DFP = DFP.replace("*fsr*", File.separator);

        DownloadFileStart DownloadFileStartT = new DownloadFileStart();
        DownloadFileStartT.start();
    }
}
