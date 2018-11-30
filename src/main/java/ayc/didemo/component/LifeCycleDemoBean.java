package ayc.didemo.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
		BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		System.out.println("LifeCycleDemoBean constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext - overridding - ApplicationContextAware Interface");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory - overridding - BeanFactoryAware Interface");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName - overridding- BeanNameAware Interface");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy - overridding - DisposableBean");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet - overridding - InitializingBean");

	}

	/// -----
	@PostConstruct
	public void postContruct() {
		System.out.println("postContruct - annotation- @PostConstruct ");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy - annotation - @PreDestroy");
	}
	/// -----

	/// -----
	public void postProcessBeforeInitialization() {
		System.out.println("postProcessBeforeInitialization - called by BeanPostProcessor");
	}

	public void postProcessAfterInitialization() {
		System.out.println("postProcessAfterInitialization - called by BeanPostProcessor");
	}
	/// -----

}
