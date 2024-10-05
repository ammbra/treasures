import static org.unix.time_h.*;
import java.lang.foreign.*;
import org.unix.*;

public static void main(String[] args) {
	try (var arena = Arena.ofConfined()) {
		var now = arena.allocateFrom(C_LONG, System.currentTimeMillis() / 1000);
		MemorySegment time = tm.allocate(arena);
		localtime_r(now, time);
		System.out.printf("Time = %d:%02d\n", tm.tm_hour(time), tm.tm_min(time));
	}
}
