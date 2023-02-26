package com.example.dictionaryapp.dictionary_feature.domain.use_case

import com.example.dictionaryapp.dictionary_feature.core.util.Resource
import com.example.dictionaryapp.dictionary_feature.domain.model.WordInfo
import com.example.dictionaryapp.dictionary_feature.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if(word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}