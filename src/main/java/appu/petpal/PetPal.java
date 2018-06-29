/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appu.petpal;

import java.util.HashMap;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Dennis
 */
public class PetPal extends JavaPlugin {

    private static final HashMap<Player, String> newPetNames = new HashMap<>();

    @Override
    public void onEnable() {
        System.out.println("Appus plugin is super awesome");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equals("setpet")) {
            if (args.length != 1) {
                // Player typed in more than one word or nothing
                // Explain how to use the command

                return true;
            }
            if (!(sender instanceof Player)) {
                // Command came from console
                // Explain that it can only be used by players
                
                return true;
            }
            
            

            //  /setpet doggo
            //   ^label ^args
            Player player = (Player) sender;
            String petName = args[0];
            newPetNames.put(player, petName);
            
            
        } else if (label.equals("pethere")) {
            if (args.length != 1) {
                // Player typed in more than one word or nothing
                // Explain how to use the command

                return true;
            }
            if (!(sender instanceof Player)) {
                // Command came from console
                // Explain that it can only be used by players
                
                return true;
            }
            
            
            
            
            
            
            
        }
        return true;
    }

}
