def svr = Jenkins.instance;

def job = svr.getJob("TEST");

def sched = job.scheduleBuild2(0);

sched.get();