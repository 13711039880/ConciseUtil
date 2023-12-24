package org.util.url;

import front.util.DownloadFile.DownloadFileStart;

import java.io.File;

public class DownloadFile {
    public static void UiToFile(String URL, String DFP) {
        DownloadFileStart.DURL = URL;
        DownloadFileStart.DFP = DFP.replace("*fsr*", File.separator);

        DownloadFileStart DownloadFileStartT = new DownloadFileStart();
        DownloadFileStartT.start();
    }
}
