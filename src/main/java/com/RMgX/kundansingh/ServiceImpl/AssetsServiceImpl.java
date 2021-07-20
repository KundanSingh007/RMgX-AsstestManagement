package com.RMgX.kundansingh.ServiceImpl;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.RMgX.kundansingh.Entity.AssetsEntity;
import com.RMgX.kundansingh.Entity.CategoryEntity;
import com.RMgX.kundansingh.repository.AssetsRepository;
import com.RMgX.kundansingh.service.AssetsEntityService;

@Service
@Transactional
public class AssetsServiceImpl implements AssetsEntityService {

	@Autowired
	private AssetsRepository assetsRepository;

	@Override
	public Category Assets(AssetsEntity assets) {
		return assetsRepository.saveAll(assets);
	}

	@SuppressWarnings("static-access")
	@Override
	public AssetsEntity updateAssetsEntity(AssetsEntity assets) {
		Optional<AssetsEntity> AssetsDb = this.assetsRepository.findById(assets.getId());

		if (AssetsDb.isPresent()) {
			AssetsEntity AssetsServiceUpdate = AssetsDb.get();
			AssetsServiceUpdate.setId(AssetsServiceUpdate.getId());
			AssetsServiceUpdate.setName(AssetsServiceUpdate.getName());
			AssetsServiceUpdate.setpurchase_date(AssetsServiceUpdate.purchase_date());
			AssetsServiceUpdate.setcondition_note(AssetsServiceUpdate.condition_note());
			AssetsServiceUpdate.setassignment_state(AssetsServiceUpdate.assignment_state());
			AssetsServiceUpdate.save(AssetsServiceUpdate);
			return AssetsServiceUpdate;
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + assets.getId());
		}
	}

	
	@Override
	public List<Category> getAllAsset() {
		return this.assetsRepository.findAllById();
	}

	
	@Override
	public AssetsEntity getAssetsEntityById(long AssetId) {

		Optional<AssetsEntity> CategoryDb = this.assetsRepository.findById(AssetId);

		if (CategoryDb.isPresent()) {
			return CategoryDb.get();
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + AssetId);
		}
	}

	@Override
	public void deleteAsset(long AssetId) {
		
		Optional<AssetsEntity> CategoryDb = this.assetsRepository.findById(AssetId);

		if (CategoryDb.isPresent()) {
			this.assetsRepository.deleteById(CategoryDb.get());
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + AssetId);
		}

	}

	@Override
	public CategoryEntity getCategoryById(long AssetId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategory(AssetsEntity assets) {
		// TODO Auto-generated method stub
		return null;
	}
}