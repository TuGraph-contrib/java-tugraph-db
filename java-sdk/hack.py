import re
import os

objectString = "jni_com_alibaba_tugraphjavasdk_internal_type"

mp = {
 "lgraph_api_date_t" : "4",
 "lgraph_api_date_time_t" : "4",
 "lgraph_api_field_data_t" : "4" ,
 "lgraph_api_field_spec_t" : "4" ,
 "lgraph_api_index_spec_t" : "4" ,
 "lgraph_api_edge_uid_t" : "4" ,
 "lgraph_api_user_info_t" : "4" ,
 "lgraph_api_role_info_t" : "4" ,
 "lgraph_api_out_edge_iterator_t" : "4" ,
 "lgraph_api_in_edge_iterator_t" : "4" ,
 "lgraph_api_vertex_iterator_t" : "4" ,
 "lgraph_api_edge_index_iterator_t" : "4" ,
 "lgraph_api_vertex_index_iterator_t" : "4" ,
 "lgraph_api_transaction_t" : "4" ,
 "lgraph_api_graph_db_t" : "4" ,
 "lgraph_api_galaxy_t" : "4"
 }

def fileProcessor(filePath):
    for file in os.listdir(filePath):
        if os.path.isfile(os.path.join(filePath, file)) and objectString in file:
            with open(os.path.join(filePath, file),'r+') as f:
                lines = f.readlines()
                for i, line in enumerate(lines):
                    pattern = r'sizeof\((.*?)\)'
                    match = re.search(pattern, line)
                    if match and (("*") not in line) :
                        obj = match.group(1)
                        lines[i] = "return " + mp[obj] + ";"
                    else:
                        lines[i] = line

                f.seek(0)
                f.truncate()
                f.writelines(lines)

if __name__ == "__main__":
    fileProcessor("./target/generated-sources/annotations")