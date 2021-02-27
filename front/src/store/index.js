import Vue from 'vue'
import Vuex from 'vuex'
import states from './states'
import actions from './actions'
import mutations from './mutations'
import getters from './getters'

Vue.use(Vuex)

export default new Vuex.Store({
  states,
  actions,
  mutations,
  getters
})
