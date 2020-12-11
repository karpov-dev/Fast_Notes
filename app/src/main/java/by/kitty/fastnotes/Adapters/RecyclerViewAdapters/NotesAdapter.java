package by.kitty.fastnotes.Adapters.RecyclerViewAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import by.kitty.fastnotes.Model.Note;
import by.kitty.fastnotes.R;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {
    private List<Note> notes;
    private LayoutInflater inflater;

    public NotesAdapter(Context context, List<Note> notes) {
        this.notes = notes;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public NotesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.note_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter.ViewHolder holder, int position) {
        Note note = notes.get(position);

        holder.titleView.setText(note.getName());
        holder.descriptionView.setText(note.getDescription());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView titleView;
        final TextView descriptionView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.titleView = (TextView) itemView.findViewById(R.id.note_title);
            this.descriptionView = (TextView) itemView.findViewById(R.id.note_description);
        }
    }
}
