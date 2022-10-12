public class Milliseconds implements TimeUnit {
    private final long millis;

    public Milliseconds(long millis) {
        this.millis = millis;
    }

    @Override
    public long toMillis() {
        return millis;
    }

    @Override
    public long toSeconds() {
        return Math.round((float) millis / 1000);
    }

    @Override
    public long toMinutes() {
        return  Math.round((float) millis / 60000);
    }

    @Override
    public long toHours() {
        return Math.round((float) millis / 3600000);
    }
}