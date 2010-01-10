<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN//EN"
   "http://www.springframework.org/dtd/spring-beans.dtd">

<beans>
#foreach( $classDesc in $CLASS_TABLE.getClassDescriptions() )
 	#set( $clsName = $classDesc.getName() )
    #set( $beanName = "${clsName.substring(0,1).toLowerCase()}${clsName.substring(1)}" )
	<bean id="$beanName" class="$classDesc.getPackage().$clsName" parent="abstractDao"/>
	
#end
</beans>