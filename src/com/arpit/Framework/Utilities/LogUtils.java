package Utilities;

import config.Settings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtils {

    /*
    To Have:
    1. File Format for the log name
    2. Create Log File
    3. Write Message within the log
     */
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
    String fileNameFormat = zonedDateTime.format(dateTimeFormatter);
    private BufferedWriter bufferedWriter = null;

    public void createLogFile() {
        String path = Settings.logPath;
//        String path = "./LogsFolder/";
        try {
            File dir = new File(path);
            if (!dir.exists())
                dir.mkdir();

            File logFile = new File(path + "/" + fileNameFormat + ".log");

            FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeLog(String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
