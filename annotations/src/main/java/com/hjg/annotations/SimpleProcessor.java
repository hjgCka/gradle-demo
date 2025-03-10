package com.hjg.annotations;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * @Description
 * @Author hjg
 * @Date 2025-03-07 20:10
 */
@SupportedAnnotationTypes("com.hjg.annotations.Simple")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class SimpleProcessor extends AbstractProcessor {

    /**
     * 覆盖上级的process方法
     * @param annotations the annotation types requested to be processed
     * @param env  environment for information about the current and prior round
     * @return
     * 含义：表示注解处理器没有处理传入的 annotations 集合中的所有注解类型，或者希望其他注解处理器也有机会处理这些注解类型。
     * 后续的注解处理器仍然会接收到这些注解类型进行处理。
     * 示例场景：如果你的注解处理器只是对部分注解类型进行了处理，而希望其他注解处理器继续处理剩余的注解类型，就可以返回 false。
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        for(TypeElement t : annotations)
            System.out.println(t);
        for(Element el : env.getElementsAnnotatedWith(Simple.class))
            display(el);
        return false;
    }

    private void display(Element el) {
        System.out.println("==== " + el + " ====");
        System.out.println(el.getKind() +
                " : " + el.getModifiers() +
                " : " + el.getSimpleName() +
                " : " + el.asType());
        if(el.getKind().equals(ElementKind.CLASS)) {
            TypeElement te = (TypeElement)el;
            System.out.println(te.getQualifiedName());
            System.out.println(te.getSuperclass());
            System.out.println(te.getEnclosedElements());
        }
        if(el.getKind().equals(ElementKind.METHOD)) {
            ExecutableElement ex = (ExecutableElement)el;
            System.out.print(ex.getReturnType() + " ");
            System.out.print(ex.getSimpleName() + "(");
            System.out.println(ex.getParameters() + ")");
        }
    }
}
