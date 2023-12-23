package org.util.url;

import front.util.DownloadFile.DownloadFileStart;

public class DownloadFile {
    public static void UiToFile(String URL, String DFP) {
        DownloadFileStart.DURL = URL;
        DownloadFileStart.DFP = DFP;

        DownloadFileStart DownloadFileStartT = new DownloadFileStart();
        DownloadFileStartT.start();
    }
}
