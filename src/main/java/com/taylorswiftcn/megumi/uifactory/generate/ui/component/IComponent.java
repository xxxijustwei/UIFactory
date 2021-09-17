package com.taylorswiftcn.megumi.uifactory.generate.ui.component;

import org.bukkit.entity.Player;

import java.util.Map;

public interface IComponent {

    String getID();

    Map<String, Object> build();

    Map<String, Object> buildAction();
}
