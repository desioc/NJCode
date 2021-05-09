package games.generic.data;

import games.generic.exceptions.PlayerException;
import games.generic.business.Game;
import games.generic.data.Player;
import java.util.List;
import java.util.ArrayList;

public abstract class MultiPlayerGame implements Game {
    private List<Player> players;

    public MultiPlayerGame () {
        init();
        start();
        play();
        end();
    }

    @Override
    public void init() {
        players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }
    
    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.add(player);
    }
    
    public Player getPlayer(int id)  throws PlayerException {
        if (id < 0) {
            throw new PlayerException("L'identificativo del player non può essere negativo");
        } else if (id >=players.size()) {
            throw new PlayerException("L'identificativo del player non esiste");
        }
        return players.get(id);
    }


    public Player getPlayer(String name) throws PlayerException {
        Player playerFound = null;
        int counter = 0;
        for (Player player : players) {
            if (player.getName().equals(name)) {
                counter++;
                playerFound = player;
            }
        }
        if (counter == 0) {
            throw new PlayerException("Player con nome "+ name +" non trovato");
        } else if (counter > 1) {
            throw new PlayerException("Trovati "+ counter +" player con nome "+ name);
        }
        return playerFound;
    }
}