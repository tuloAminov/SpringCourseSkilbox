public class Minutes implements TimeUnit {
    private final long minutes;

    public Minutes(long minutes) {
        this.minutes = minutes;
    }

    @Override
    public long toMillis() {
        return minutes * 60000;
    }

    @Override
    public long toSeconds() {
        return minutes * 60;
    }

    @Override
    public long toMinutes() {
        return minutes;
    }

    @Override
    public long toHours() {
        return Math.round((float) minutes / 60);
    }
}