package com.taylorswiftcn.megumi.uifactory.generate.ui.component.base;

import com.taylorswiftcn.megumi.uifactory.generate.type.EntityViewType;
import com.taylorswiftcn.megumi.uifactory.generate.ui.component.BasicComponent;
import com.taylorswiftcn.megumi.uifactory.generate.ui.component.ComponentField;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
@ComponentField(define = "entity")
public class EntityViewComp extends BasicComponent {

    @ComponentField(define = "entity")
    private String entity;

    @ComponentField(define = "head")
    private Boolean showHead;

    @ComponentField(define = "followMouse")
    private Boolean followMouse;

    public EntityViewComp(String id, EntityViewType entityType) {
        super(id);
        this.entity = entityType.getName();
    }

    public EntityViewComp(String id, String entity) {
        super(id);
        this.entity = entity;
    }

    public EntityViewComp setEntity(String entity) {
        this.entity = entity;
        return this;
    }

    public EntityViewComp setShowHead(Boolean showHead) {
        this.showHead = showHead;
        return this;
    }

    public EntityViewComp setFollowMouse(Boolean followMouse) {
        this.followMouse = followMouse;
        return this;
    }
}
