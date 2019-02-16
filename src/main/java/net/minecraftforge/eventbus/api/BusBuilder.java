package net.minecraftforge.eventbus.api;

import net.minecraftforge.eventbus.EventBus;

/**
 * Build a bus
 */
public final class BusBuilder {
    private IEventExceptionHandler exceptionHandler;

    // true by default
    private boolean trackPhases = true;

    public static BusBuilder builder() {
        return new BusBuilder();
    }

    public BusBuilder setTrackPhases(boolean trackPhases) {
        this.trackPhases = trackPhases;
        return this;
    }

    public BusBuilder setExceptionHandler(IEventExceptionHandler handler) {
        this.exceptionHandler =  handler;
        return this;
    }

    public IEventExceptionHandler getExceptionHandler() {
        return exceptionHandler;
    }

    public boolean getTrackPhases() {
        return trackPhases;
    }

    public IEventBus build() {
        return new EventBus(this);
    }
}
