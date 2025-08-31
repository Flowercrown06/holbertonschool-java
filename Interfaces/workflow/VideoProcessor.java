

import java.util.ArrayList;
import java.util.List;

public class VideoProcessor {
    private List<NotificationChannel> channels = new ArrayList<>();

    public void registerChannel(NotificationChannel channel){
        channels.add(channel);
    }
    public void process(Video video){
        Message message = new Message(video.getFile(), MessageType.LOG);
        for(NotificationChannel channel : channels){
            channel.notify(message);
            System.out.printf(" - %s\n", video.getFormat());

        }

    }
}
