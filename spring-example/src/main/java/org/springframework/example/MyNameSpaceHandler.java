package org.springframework.example;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.xml.NamespaceHandler;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * @author zhufeifei 2023/11/9
 **/

public class MyNameSpaceHandler implements NamespaceHandler {

	@Override
	public void init() {

	}

	@Override
	public BeanDefinition parse(Element element, ParserContext parserContext) {
		return null;
	}

	@Override
	public BeanDefinitionHolder decorate(Node source, BeanDefinitionHolder definition, ParserContext parserContext) {
		return null;
	}
}
