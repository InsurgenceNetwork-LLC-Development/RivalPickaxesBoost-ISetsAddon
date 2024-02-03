package org.insurgencedev.addons.rivalpickaxesboost;

import org.insurgencedev.addons.rivalpickaxesboost.listeners.RivalPickaxesEventListener;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;
import org.insurgencedev.insurgencesets.libs.fo.Common;

@ISetsAddon(name = "RivalPickaxesBoost", version = "1.0.0", author = "Insurgence Dev Team", description = "RivalPickaxes Support")
public class RivalPickaxesBoost extends InsurgenceSetsAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Common.doesPluginExist("RivalPickaxes")) {
            registerEvent(new RivalPickaxesEventListener());
        }
    }
}
