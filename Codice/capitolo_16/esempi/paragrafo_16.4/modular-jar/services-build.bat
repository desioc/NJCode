javac -d mods --module-source-path src src/it.nuovojava.spi/module-info.java src/it.nuovojava.spi/it/nuovojava/spi/* src/it.nuovojava.invs/module-info.java src/it.nuovojava.invs/it/nuovojava/invs/* src/it.nuovojava.certs/module-info.java src/it.nuovojava.certs/it/nuovojava/certs/* src/it.nuovojava.factory/module-info.java src/it.nuovojava.factory/it/nuovojava/factory/* src/it.nuovojava.handlers/module-info.java src/it.nuovojava.handlers/it/nuovojava/handlers/* src/it.nuovojava.client/module-info.java src/it.nuovojava.client/it/nuovojava/client/*

jar --create --file=lib/it.nuovojava.spi.jar --module-version=1.0 -C mods/it.nuovojava.spi .
jar --create --file=lib/it.nuovojava.invs.jar --module-version=1.0 -C mods/it.nuovojava.invs .
jar --create --file=lib/it.nuovojava.certs.jar --module-version=1.0 -C mods/it.nuovojava.certs .
jar --create --file=lib/it.nuovojava.factory.jar --module-version=1.0 -C mods/it.nuovojava.factory .
jar --create --file=lib/it.nuovojava.handlers.jar --module-version=1.0 -C mods/it.nuovojava.handlers .
jar --create --file=lib/it.nuovojava.client.jar --module-version=1.0 --main-class=it.nuovojava.client.TrademarkClient -C mods/it.nuovojava.client .

pause;