import java.util.concurrent.atomic.AtomicLong;

abstract class Ided {

static final AtomicLong NEXT_ID = new AtomicLong(1);
 long id;

public long getId() {
        return id = NEXT_ID.getAndIncrement();
        }
}