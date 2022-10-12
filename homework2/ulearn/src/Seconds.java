public class Seconds implements TimeUnit {
    private final long seconds;

    public Seconds(long seconds) {
        this.seconds = seconds;
    }

    @Override
    public long toMillis() {
        return seconds * 1000;
    }

    @Override
    public long toSeconds() {
        return seconds;
    }

    @Override
    public long toMinutes() {
        return Math.round((float) seconds / 60);
    }

    @Override
    public long toHours() {
        return Math.round((float) seconds / 3600);
    }
}