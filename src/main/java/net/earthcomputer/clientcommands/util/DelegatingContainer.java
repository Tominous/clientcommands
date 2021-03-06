package net.earthcomputer.clientcommands.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class DelegatingContainer extends Container {

	@Proxy
	private Container delegate;

	public DelegatingContainer(Container delegate) {
		this.delegate = delegate;
		this.windowId = delegate.windowId;
		this.inventoryItemStacks = delegate.inventoryItemStacks;
		this.inventorySlots = delegate.inventorySlots;
		this.listeners = delegate.listeners;
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return delegate.canInteractWith(playerIn);
	}

}
