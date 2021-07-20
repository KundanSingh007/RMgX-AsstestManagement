package com.RMgX.kundansingh.service;

import java.util.List;
import java.util.Locale.Category;

import com.RMgX.kundansingh.Entity.AssetsEntity;
import com.RMgX.kundansingh.Entity.CategoryEntity;

public interface AssetsEntityService {

	Category Assets(AssetsEntity assets);

	void deleteAsset(long AssetId);

	CategoryEntity getCategoryById(long AssetId);

	List<Category> getAllAsset();

	Category updateCategory(AssetsEntity assets);

	AssetsEntity updateAssetsEntity(AssetsEntityService assetsEntityService);

	AssetsEntity getAssetsEntityById(long AssetId);

	Object getAllAssets();

	Object updateassetsEntityService(AssetsEntityService assetsEntityService);

	void deleteassetsEntityService(long id);

}
