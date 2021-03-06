//package reminder;
//
//import main.Bot;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import reminder.timer_task.EveryHalfHourTask;
//import tool.DateUtil;
//
//import java.util.Date;
//import java.util.Timer;
//
///**
// * Created by Yerassyl_Turlygazhy on 21-Dec-17.
// */
//public class Reminder {
//    private static final Logger logger = LoggerFactory.getLogger(Reminder.class);
//
//    private Bot bot;
//    private Timer timer = new Timer(true);
//
//    public Reminder(Bot bot) {
//        this.bot = bot;
//        setNextNightTask();
//        setNextHalfHourTask();
//    }
//
//    public void setNextHalfHourTask() {
//        Date date = DateUtil.nextHaltHour();
//        logger.info("new reminder time: " + date);
//        timer.schedule(new EveryHalfHourTask(bot, this), date);
//    }
//
//    public void setNextNightTask() {
//        Date date = DateUtil.getNextNight();
////        Date date = new Date();
////        date.setSeconds(date.getSeconds() + 1);
//        logger.info("new reminder time: " + date);
//        EveryNightTask everyNightTask = new EveryNightTask(bot, this);
//        timer.schedule(everyNightTask, date);
//    }
//
//}
