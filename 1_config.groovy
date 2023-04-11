import jenkins.model.*;
import java.util.logging.Logger

Logger logger = Logger.getLogger("")

logger.info "Executing init script"

Jenkins.instance.setDisableRememberMe(true)
Jenkins.instance.setSystemMessage('Jenkins Server - Automating Jenkins with Groovy')
Jenkins.instance.save()

logger.info "Init script complete"