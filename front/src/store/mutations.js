import { FETCH_COMMUNITY_LIST, FETCH_COMMUNITY } from './mutation-types';

export default {
    [FETCH_COMMUNITY_LIST] (state, communities){
        state.communities = communities;
    },
    [FETCH_COMMUNITY] (state, community){
        state.communities = community;
    },
};