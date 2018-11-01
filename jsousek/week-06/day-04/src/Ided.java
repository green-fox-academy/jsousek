import java.util.concurrent.atomic.AtomicLong;

abstract class Ided {

static final AtomicLong NEXT_ID = new AtomicLong(1);
final long id = NEXT_ID.getAndIncrement();

public long getId() {
        return id;
        }
}