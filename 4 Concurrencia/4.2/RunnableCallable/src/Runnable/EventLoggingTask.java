package Runnable;

import java.util.logging.Logger;

public class EventLoggingTask implements  Runnable{
    private static final Logger LoggerFactory = null;
	private Logger logger = LoggerFactory.getAnonymousLogger();

  @Override
  public void run() {
      logger.info("Mensaje de log");
  }


}
