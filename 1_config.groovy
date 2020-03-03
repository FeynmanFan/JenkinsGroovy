import jenkins.model.*;
import java.util.logging.Logger;

Logger logger = Logger.getLogger("")

logger.info "Executing init script"

def instance = Jenkins.instance
instance.setDisableRememberMe(true)
instance.setSystemMessage('Automating Jenkins with Groovy')
instance.save()

logger.info "Init script complete"
